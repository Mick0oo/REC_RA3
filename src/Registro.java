public class Registro {
    String codigo;

    public Registro(String codigo) {
        if (codigo.length() != 9) {
            System.out.println("O código não tem 9 dígitos!");
        }
        for (int i = 0; i < codigo.length(); i++) {
            char c = codigo.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("Código deve ser composto apenas por números.");
            }
        }

        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}