package Mi_Web_Backend.Email.Controller;

import Mi_Web_Backend.Email.Model.EmailDetails;
import Mi_Web_Backend.Util.Path;
import Mi_Web_Backend.Email.Service.EmailService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = Path.crossOrigin)
public class EmailController {

    @Autowired private EmailService emailService;

    // Sending a simple Email
    @PostMapping("/send-email")
    public ResponseEntity<?> ResendMail(@RequestBody @NotNull EmailDetails details) {

        //Me envio un correo para mi con los datos obtenidos
        String forMeMsg = "\nHola Gaspy ,recibiste un correo de : "+details.getRecipient()+"\n\nMensaje Recibido:\n  "+details.getMsgBody();
        EmailDetails forMeEmail = new EmailDetails("gaspygj@gmail.com",forMeMsg, details.getSubject());
        String statusForMeEmail = emailService.sendSimpleMail(forMeEmail);

        System.out.println(details.getMsgBody());

        //Envio un correo notificatorio a la otra persona
        String responseMsg = "Hola, un gusto que te hayas contactado conmigo, recibí correctamente el correo que me enviaste :).\nMe comunicaré a la brevedad.\n\n"+"Saludos, Gaspar Jullier";
        String responseSubject="Correo recibido correctamente.";
        EmailDetails responseEmail = new EmailDetails(details.getRecipient(),responseMsg,responseSubject);
        String statusResponseEmail = emailService.sendSimpleMail(responseEmail);

        String statusGlobalJSON = "{\"StatusMeEmail\":\""+statusForMeEmail+"\",\"StatusResponseEmail\":\""+statusResponseEmail+"\"}";

        //String statusGlobal = "StatusMeEmail:"+statusForMeEmail+"\nStatusResponseEmail+:"+statusResponseEmail;
        /*Si lo mando como string normal me da error el navegador :
        //error: {error: SyntaxError: Unexpected token 'S', "StatusMeEm"... is not valid JSON at JSON.parse
        (<anonymous>…, text: 'StatusMeEmail:Mail Sent Successfully...\nStatusResponseEmail+:Mail Sent Successfully...'} */

        //[[Prototype]]: HttpResponseBase

        return new ResponseEntity<>(statusGlobalJSON,HttpStatus.ACCEPTED);
    }

    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details) {
        String status = emailService.sendMailWithAttachment(details);
        return status;
    }
}