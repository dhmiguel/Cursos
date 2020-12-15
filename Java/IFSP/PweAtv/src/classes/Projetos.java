package classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;


public class Projetos {
 
	private String	tableName = "";
	private String	fieldsName = "";
	private String	keyField = "";
	private String	where = "";
	private DBQuery	dbQuery = new DBQuery(tableName, fieldsName, keyField);
	

	private int	idProjeto;
	private String	projeto;
	private String	descricao;

	public Projetos(){
		this.tableName  = "projetos";
		this.fieldsName = "idProjeto, projeto, descricao";
		this.keyField   = "idProjeto";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	}

	public Projetos(int idProjeto, String projeto, String descricao){
		this.tableName  = "projetos";
		this.fieldsName = "idProjeto, projeto, descricao";
		this.keyField   = "idProjeto";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	
		this.setIdProjeto( idProjeto);
		this.setProjeto( projeto);
		this.setDescricao( descricao);
	}
	public String toString(){
		return (
			this.getIdProjeto() +", "+
			this.getProjeto() +", "+
			this.getDescricao() +", "
		);
	 }

	public String[] toArray(){
		return (
			new String[] { 
				""+this.getIdProjeto(),
				""+this.getProjeto(),
				""+this.getDescricao()
			}
		);
	 }

	public void save() {
		  if ((this.getIdProjeto() == 0 )){
		       this.dbQuery.insert(this.toArray());
          }else{
		      this.dbQuery.update(this.toArray());
          }
        }
	
        public void delete() {
            if (this.getIdProjeto() > 0 ){
                this.dbQuery.delete( this.toArray() );
            }
        }
	    
	   public String listAll() {
	       ResultSet rs =  this.dbQuery.select("");
           String saida = "<br>";
	       saida += "<table border=1>";
		
		   try {
		      while (rs.next()) {
			     saida += "<tr>";
			     
				 saida += "<td>" + rs.getString("idProjeto" ) +  "</td>";
				 saida += "<td>" + rs.getString("projeto" ) +  "</td>";
				 saida += "<td>" + rs.getString("descricao" ) +  "</td>";
			     saida += "</tr> <br>";
		      }
		   } catch (SQLException e) {
			 e.printStackTrace();
		   }
		   saida += "</table>";
		   return (saida);
	   }

	
	public void	setIdProjeto( int idProjeto ){
		this.idProjeto=idProjeto;
	};
	
	public int	 getIdProjeto(){
		return ( this.idProjeto );
	};
	
	public void	setProjeto( String projeto ){
		this.projeto=projeto;
	};
	
	public String	 getProjeto(){
		return ( this.projeto );
	};
	
	public void	setDescricao( String descricao ){
		this.descricao=descricao;
	};
	
	public String	 getDescricao(){
		return ( this.descricao );
	};
	
} 
