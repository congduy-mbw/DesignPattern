package CompositePattern;

public class CompositeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("Test one");
		File file2 = new File("Test two");
		File file3 = new File("Test three");
		
		Directory directory1 = new Directory("Test directory 1");
		Directory directory2 = new Directory("Test directory 2");
		
		Directory directory = new Directory("root");
		
		directory.addComponent(directory1);
		directory.addComponent(directory2);
		
		directory1.addComponent(file1);
		directory1.addComponent(file2);
		directory1.addComponent(file3);
		
		directory.showDetail();
		
		System.out.println("Cấu trúc html");
		HtmlTag parentTag = new HtmlParentElement("html");
		parentTag.setStartTag("<html>");
		parentTag.setEndTag("</html>");
		
		HtmlTag body = new HtmlParentElement("body");
		body.setStartTag("<body>");
		body.setEndTag("</body>");
		
		HtmlTag p1 = new HtmlElement("p");
		p1.setStartTag("<p>");
		p1.setEndTag("</p>");
		p1.setTagBody("This is test tag p");
		body.addChildTag(p1);
		
		parentTag.addChildTag(body);
		parentTag.generateHtml();
		
		
	}

}
