package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HtmlTag> childrenTag;
	
	public HtmlParentElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<HtmlTag>();
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
	public void addChildTag(HtmlTag tag) {
		this.childrenTag.add(tag);
	}
	
	@Override
	public void removeChildTag(HtmlTag tag) {
		this.childrenTag.remove(tag);
	}
	
	@Override
	public List<HtmlTag> getChildren(){
		return this.childrenTag;
	}

	@Override
	public void generateHtml() {
		// TODO Auto-generated method stub
		System.out.println(this.startTag);
		for(HtmlTag htmlTag: this.childrenTag) {
			htmlTag.generateHtml();
		}
		System.out.println(this.endTag);
	}
	
	
}
