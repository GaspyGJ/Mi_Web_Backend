package Mi_Web_Backend.Email.Service;

import Mi_Web_Backend.Email.Model.EmailDetails;

public interface EmailService {
    //Interface de servicio para enviar E-mails
    String sendSimpleMail(EmailDetails details);

    String sendMailWithAttachment(EmailDetails details); //para enviar correos con archivos adjuntos
}
