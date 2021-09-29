package hibernate;

public class UserDocumentsP 
{
	private int id;
	
	private FilePath file_path;
	
	private String id_no;
	
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public FilePath getFile_path() {
		return file_path;
	}

	public void setFile_path(FilePath file_path) {
		this.file_path = file_path;
	}

	public String getId_no() {
		return id_no;
	}

	public void setId_no(String id_no) {
		this.id_no = id_no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
