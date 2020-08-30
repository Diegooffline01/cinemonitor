class Main {
  public static void main(String[] args) {
    
    Filme filme = new Filme();
    filme.setTitulo("Bad Boys 3");
    filme.setAno(2020);
    filme.setTipo(18);
    
    System.out.println("Filme: "+filme.getTitulo());
    System.out.println("Ano: "+filme.getAno());
    System.out.println("Tipo: "+filme.getTipo());
  }
}