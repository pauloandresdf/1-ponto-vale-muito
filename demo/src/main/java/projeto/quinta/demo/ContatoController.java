import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    private static String nome = "eduarda";
    private static String telefone = "(81) 99990-9999";
    private static String email = "jaciara@gmail.com";

    
    private String nomeCadastrado;
    private String telefoneCadastrado;
    private String emailCadastrado;

    @GetMapping("/dados")
    public String getDadosFixos() {
        return "Nome: ", nome,", Telefone: ", telefone, ", Email: ", email;
    }

    @PostMapping("/cadastrar")
    public String cadastrarContato(@RequestParam String nome,
                                   @RequestParam String telefone,
                                   @RequestParam String email) {
        this.nomeCadastrado = nome;
        this.telefoneCadastrado = telefone;
        this.emailCadastrado = email;
        return "Contato cadastrado!!!!!";
    }

    @DeleteMapping("/remover")
    public String removerContato(@RequestParam String telefone) {
        if (telefone.equals(this.telefoneCadastrado)) {
            this.nomeCadastrado = null;
            this.telefoneCadastrado = null;
            this.emailCadastrado = null;
            return "Contato apagado";
        } else {
            return "dados n encon
            trado";
        }
    }
}
