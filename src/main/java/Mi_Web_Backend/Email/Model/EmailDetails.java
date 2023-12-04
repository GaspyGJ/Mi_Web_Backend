package Mi_Web_Backend.Email.Model;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// Annotations
@Data
@NoArgsConstructor
public class EmailDetails implements Serializable {
    //Estructura de un Email
    private String recipient; // direccion email del emisor
    private String msgBody; // mensaje
    private String subject; //asunto
    private String attachment; //para archivos adjuntos

    public EmailDetails(String recipient, String msgBody, String subject) {
        this.recipient = recipient;
        this.msgBody = msgBody;
        this.subject = subject;
    }
    public EmailDetails(String recipient, String msgBody, String subject, String attachment) {
        this.recipient = recipient;
        this.msgBody = msgBody;
        this.subject = subject;
        this.attachment = attachment;
    }
}
