package domain;

public class Information {
	private String id;
	private String title;
	private String content;
	private String publishingTime;
	private String publishingUser;
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPublishingTime() {
		return publishingTime;
	}

	public void setPublishingTime(String publishingTime) {
		this.publishingTime = publishingTime;
	}

	public String getPublishingUser() {
		return publishingUser;
	}

	public void setPublishingUser(String publishingUser) {
		this.publishingUser = publishingUser;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Information(String id, String title, String content,
			String publishingTime, String publishingUser, String type) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.publishingTime = publishingTime;
		this.publishingUser = publishingUser;
		this.type = type;
	}

}
