class Documento implements Cloneable {
    private String conteudo;

    public Documento(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    @Override
    public Documento clone() throws CloneNotSupportedException {
        return (Documento) super.clone();
    }
}