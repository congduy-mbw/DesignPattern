package CompositePattern;

public class HtmlElement extends HtmlTag {
	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;
	
	public HtmlElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.tagBody = "";
	}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return this.tagName;
	}

	@Override
	public void setStartTag(String tag) {
		// TODO Auto-generated method stub
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		// TODO Auto-generated method stub
		this.endTag = tag;
	}
	
	@Override
	public void setTagBody(String tagBody) {
		this.tagBody = tagBody;
	}

	@Override
	public void generateHtml() {
		// TODO Auto-generated method stub
		System.out.println(this.startTag+""+this.tagBody+""+this.endTag);
	}
	
}
