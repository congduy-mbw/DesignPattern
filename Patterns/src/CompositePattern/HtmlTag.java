package CompositePattern;

import java.util.List;

public abstract class HtmlTag {
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody) {
		throw new UnsupportedOperationException("Current operation is not support");
	}
	public void addChildTag(HtmlTag tag) {
		throw new UnsupportedOperationException("Current operation is not support");
	}
	public void removeChildTag(HtmlTag tag) {
		throw new UnsupportedOperationException("Current operation is not support");
	}
	public List<HtmlTag> getChildren(){
		throw new UnsupportedOperationException("Current operation is not support");
	}
	public abstract void generateHtml();
}
