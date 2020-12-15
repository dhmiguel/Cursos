package classes;

import java.sql.ResultSet;
import java.sql.SQLException;

import database.DBQuery;


public class Tarefas {
 
	private String	tableName = "";
	private String	fieldsName = "";
	private String	keyField = "";
	private String	where = "";
	private DBQuery	dbQuery = new DBQuery(tableName, fieldsName, keyField);
	

	private int	idTarefa;
	private String	nome;
	private int	ordem;
	private String	inicio;
	private String	fim;
	private int	duracao;
	private int	completo;
	private int	dependencia;
	private int	idProjeto;

	public Tarefas(){
		this.tableName  = "tarefas";
		this.fieldsName = "idTarefa, nome, ordem, inicio, fim, duracao, completo, dependencia, idProjeto";
		this.keyField   = "idTarefa";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	}

	public Tarefas(int idTarefa, String nome, int ordem, String inicio, String fim, int duracao, int completo, int dependencia, int idProjeto){
		this.tableName  = "tarefas";
		this.fieldsName = "idTarefa, nome, ordem, inicio, fim, duracao, completo, dependencia, idProjeto";
		this.keyField   = "idTarefa";
		this.dbQuery = new DBQuery(this.tableName, this.fieldsName, this.keyField);
	
		this.setIdTarefa( idTarefa);
		this.setNome( nome);
		this.setOrdem( ordem);
		this.setInicio( inicio);
		this.setFim( fim);
		this.setDuracao( duracao);
		this.setCompleto( completo);
		this.setDependencia( dependencia);
		this.setIdProjeto( idProjeto);
	}
	public String toString(){
		return (
			this.getIdTarefa() +", "+
			this.getNome() +", "+
			this.getOrdem() +", "+
			this.getInicio() +", "+
			this.getFim() +", "+
			this.getDuracao() +", "+
			this.getCompleto() +", "+
			this.getDependencia() +", "+
			this.getIdProjeto() +", "
		);
	 }

	public String[] toArray(){
		return (
			new String[] { 
				""+this.getIdTarefa(),
				""+this.getNome(),
				""+this.getOrdem(),
				""+this.getInicio(),
				""+this.getFim(),
				""+this.getDuracao(),
				""+this.getCompleto(),
				""+this.getDependencia(),
				""+this.getIdProjeto()
			}
		);
	 }

	public void save() {
		  if ((this.getIdTarefa() == 0 )){
		       this.dbQuery.insert(this.toArray());
          }else{
		      this.dbQuery.update(this.toArray());
          }
        }
	
        public void delete() {
            if (this.getIdTarefa() > 0 ){
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
			     
				 saida += "<td>" + rs.getString("idTarefa" ) +  "</td>";
				 saida += "<td>" + rs.getString("nome" ) +  "</td>";
				 saida += "<td>" + rs.getString("ordem" ) +  "</td>";
				 saida += "<td>" + rs.getString("inicio" ) +  "</td>";
				 saida += "<td>" + rs.getString("fim" ) +  "</td>";
				 saida += "<td>" + rs.getString("duracao" ) +  "</td>";
				 saida += "<td>" + rs.getString("completo" ) +  "</td>";
				 saida += "<td>" + rs.getString("dependencia" ) +  "</td>";
				 saida += "<td>" + rs.getString("idProjeto" ) +  "</td>";
			     saida += "</tr> <br>";
		      }
		   } catch (SQLException e) {
			 e.printStackTrace();
		   }
		   saida += "</table>";
		   return (saida);
	   }

	
	public void	setIdTarefa( int idTarefa ){
		this.idTarefa=idTarefa;
	};
	
	public int	 getIdTarefa(){
		return ( this.idTarefa );
	};
	
	public void	setNome( String nome ){
		this.nome=nome;
	};
	
	public String	 getNome(){
		return ( this.nome );
	};
	
	public void	setOrdem( int ordem ){
		this.ordem=ordem;
	};
	
	public int	 getOrdem(){
		return ( this.ordem );
	};
	
	public void	setInicio( String inicio ){
		this.inicio=inicio;
	};
	
	public String	 getInicio(){
		return ( this.inicio );
	};
	
	public void	setFim( String fim ){
		this.fim=fim;
	};
	
	public String	 getFim(){
		return ( this.fim );
	};
	
	public void	setDuracao( int duracao ){
		this.duracao=duracao;
	};
	
	public int	 getDuracao(){
		return ( this.duracao );
	};
	
	public void	setCompleto( int completo ){
		this.completo=completo;
	};
	
	public int	 getCompleto(){
		return ( this.completo );
	};
	
	public void	setDependencia( int dependencia ){
		this.dependencia=dependencia;
	};
	
	public int	 getDependencia(){
		return ( this.dependencia );
	};
	
	public void	setIdProjeto( int idProjeto ){
		this.idProjeto=idProjeto;
	};
	
	public int	 getIdProjeto(){
		return ( this.idProjeto );
	};
	
} 
