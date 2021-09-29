package hibernate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="local_services_documents")
@Table(name="local_services_documents")
public class LocalServicesDocuments 
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
	private LocalServices local_service;

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

	public LocalServices getLocal_service() {
		return local_service;
	}

	public void setLocal_service(LocalServices local_service) {
		this.local_service = local_service;
	}

	public int getId() {
		return id;
	}
	
	public LocalServicesDocumentsP toPOJO()
	{
		LocalServicesDocumentsP lsdp=new LocalServicesDocumentsP();
		lsdp.setFile_path(file_path);
		lsdp.setId(id);
		lsdp.setId_no(id_no);
		lsdp.setType(type);
		return lsdp;
	}
}