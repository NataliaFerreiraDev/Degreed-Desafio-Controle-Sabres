package model.entities;

public class Sabre {
	
	private Integer idSabre;
	private String modelo;
	private String dataFabricacao;
	private String situacao;
	private String jedi;
	private String modeloBotaoDestrava;
	private String galaxias;
	private String modeloSensorDestrava;
	private String validadeSensorDestrava;
	
	public Sabre() {
	}	

	public Sabre(Integer idSabre, String modelo, String dataFabricacao, String situacao, String jedi,
			String modeloBotaoDestrava, String galaxias, String modeloSensorDestrava,
			String validadeSensorDestrava) {
		super();
		this.idSabre = idSabre;
		this.modelo = modelo;
		this.dataFabricacao = dataFabricacao;
		this.situacao = situacao;
		this.jedi = jedi;
		this.modeloBotaoDestrava = modeloBotaoDestrava;
		this.galaxias = galaxias;
		this.modeloSensorDestrava = modeloSensorDestrava;
		this.validadeSensorDestrava = validadeSensorDestrava;
	}

	public Integer getIdSabre() {
		return idSabre;
	}

	public void setIdSabre(Integer idSabre) {
		this.idSabre = idSabre;
	}

	public String getModelo() {
		return modelo.toString();
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getSituacao() {
		return situacao.toString();
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getJedi() {
		return jedi;
	}

	public void setJedi(String jedi) {
		this.jedi = jedi;
	}

	public String getModeloBotaoDestrava() {
		return modeloBotaoDestrava;
	}

	public void setModeloBotaoDestrava(String modeloBotaoDestrava) {
		this.modeloBotaoDestrava = modeloBotaoDestrava;
	}

	public String getGalaxias() {
		return galaxias;
	}

	public void setGalaxias(String galaxias) {
		this.galaxias = galaxias;
	}

	public String getModeloSensorDestrava() {
		return modeloSensorDestrava;
	}

	public void setModeloSensorDestrava(String modeloSensorDestrava) {
		this.modeloSensorDestrava = modeloSensorDestrava;
	}

	public String getValidadeSensorDestrava() {
		return validadeSensorDestrava;
	}

	public void setValidadeSensorDestrava(String validadeSensorDestrava) {
		this.validadeSensorDestrava = validadeSensorDestrava;
	}

}
