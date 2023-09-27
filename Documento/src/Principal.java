public class Principal {
    public static void main(String[] args) {
        // Criando um documento original
        Documento documentoOriginal = new Curriculo("Conteúdo do currículo");

        try {
            // Clonando o documento original
            Documento documentoClonado = documentoOriginal.clone();

            // Modificando o conteúdo do clone
            documentoClonado.setConteudo("Novo conteúdo do currículo");

            // Imprimindo os conteúdos
            System.out.println("Original: " + documentoOriginal.getConteudo());
            System.out.println("Clone: " + documentoClonado.getConteudo());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}