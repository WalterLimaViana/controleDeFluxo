public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");                
            }
            case "M":{                
                System.out.println("Whats e Instagram grátis");                
            }
            case "B":{                
                System.out.println("100 minutos de Ligação");                                
            }
        }
    }
}

//Nesse caso, você pode utilizar o switch case sem o break, deixando organizado por ordem do que simples para o mais completo
// se for escolhido o T, vai aparecer todos os println abaixo dele.