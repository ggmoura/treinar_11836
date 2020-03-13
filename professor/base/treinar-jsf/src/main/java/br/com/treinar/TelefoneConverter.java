package br.com.treinar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.treinar.model.Telefone;

@FacesConverter(value = "br.com.treinar.TelefoneConverter")
public class TelefoneConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		Telefone t = new Telefone();
		t.setDdd(Integer.parseInt(value.substring(0, 2)));
		t.setNumero(Integer.parseInt(value.substring(2)));
		return t;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Telefone t = (Telefone) value;
		String numero = "";
		if (t.getDdd() != null && t.getNumero() != null) {
			numero = String.valueOf(t.getDdd()).concat(String.valueOf(t.getNumero()));
		}
		return numero;
	}

}
