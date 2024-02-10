import java.io.*;

class HtmlChecker{
  static int index = 0;
  static String stack[] = new String[100];
  static int top = -1;

  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Paste the HTML code: ");
    String html = br.readLine();

    while(index < html.length()){
      String tag = nextTag(html);

      //push the opening <tag>
      if(tag.charAt(1) != '/'){
        top++;
        stack[top] = tag;
      }

      //check and pop the closing </tag>
      else{
        String closingTag = tag.substring(2);
        closingTag = "<" + closingTag;

        //valid tag
        if(closingTag.equalsIgnoreCase(stack[top])){
          stack[top] = "";
	  top--;
        }
	//invalid tag
        else{
	  System.out.println("Missing Tag: " + stack[top]);
  	}
      }
    }

    if(top > -1) System.out.println("Missing Tag: " + stack[top]);
  }
  
  //function to return the next tag
  static String nextTag(String html){
    int pos = html.indexOf('<', index);
    String tag = "";

    while(html.charAt(pos) != '>'){
      tag += html.charAt(pos++);
    }
    tag += html.charAt(pos);
    index = pos+1;

    return tag;
  }
}