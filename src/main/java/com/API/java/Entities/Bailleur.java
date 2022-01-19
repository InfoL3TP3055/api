package com.API.java.Entities;


//import java.util.Collection;

/*import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;

*/
//import javax.persistence.FetchType;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bailleur" ,schema ="public")
public class Bailleur extends User{
	 
	
	private static final long serialVersionUID = 1L;
	/*@OneToMany(mappedBy = "propriete",fetch =FetchType.LAZY)
	private Collection<Propriete> propriete;
	*/
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}



	@Override
	public void setId(Long id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}



	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}



	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername(username);
	}



	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}



	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}



	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}



	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}



	@Override
	public String getProffession() {
		// TODO Auto-generated method stub
		return super.getProffession();
	}



	@Override
	public void setProffession(String proffession) {
		// TODO Auto-generated method stub
		super.setProffession(proffession);
	}



	@Override
	public String getNum_tel() {
		// TODO Auto-generated method stub
		return super.getNum_tel();
	}



	@Override
	public void setNum_tel(String num_tel) {
		// TODO Auto-generated method stub
		super.setNum_tel(num_tel);
	}



	@Override
	public int getNum_cni() {
		// TODO Auto-generated method stub
		return super.getNum_cni();
	}



	@Override
	public void setNum_cni(int num_cni) {
		// TODO Auto-generated method stub
		super.setNum_cni(num_cni);
	}



	public Bailleur() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Bailleur(Long id, String username, String email, String password, String proffession, String num_tel,
			int num_cni) {
		super(id, username, email, password, proffession, num_tel, num_cni);
		
	}

	
	@Override
	public String toString() {
		return super.toString() ;
	}
	
	
	

}
