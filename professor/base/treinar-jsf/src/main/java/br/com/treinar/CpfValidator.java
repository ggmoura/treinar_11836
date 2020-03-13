package br.com.treinar;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.treinar.util.ValidaCPF;

@FacesValidator("br.com.treinar.CpfValidator")
public class CpfValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		Long cpf = (Long) value;
		if (!ValidaCPF.isCPF(cpf.toString())) {
			FacesMessage msg = 
					new FacesMessage("CPF Inválido.", 
							"Invalid CPF.");
				msg.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(msg);
		}
	}

}
