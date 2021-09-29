package hibernate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="user_documents")
@Table(name="user_documents")
public class UserDocuments
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Embedded
	private FilePath file_path;
	
	@Column(unique=true,nullable=false)
	private String id_no;
	
	@Column(nullable=false)
	private String type;
	
	@ManyToOne
	private Users user;

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

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public UserDocumentsP toPOJO()
	{
		UserDocumentsP udp = new UserDocumentsP();
		udp.setId(id);
		udp.setFile_path(file_path);
		udp.setId_no(id_no);
		udp.setType(type);
		return udp;
	}
	
}