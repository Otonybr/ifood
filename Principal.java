
package marketplace;

import java.util.ArrayList;

import java.util.Scanner;



public class Principal implements Controle  {
    public static void main(String[] args) {
        
        ArrayList <Controle> produto= new ArrayList();
        ArrayList <Frete> frete=new ArrayList();
        
        
        System.out.print("BEM VINDO A NOSSA PLATAFORMA");
        
        

       //loop do Menu
        while(true){
        
        System.out.println("\n");
        System.out.print("---------MENU---------");
        System.out.println("\n");
        System.out.println("[0] SAIR");
        System.out.println("[1] ver lista de produtos");
        System.out.println("[2] detalhes dos produtos");
        System.out.println("[3] cadastrar frete");
        System.out.println("[4] lista de fretes");
        System.out.println("[5] editar frete");
        System.out.println("[6] excluir frete");
        System.out.println("[7] cadastrar anuncio");
        System.out.println("[8] editar anuncio");
        System.out.println("[9] excluir anuncio");
        
        System.out.println("\n");
        
        int num;
        Scanner input= new Scanner(System.in);
        Scanner inputString= new Scanner (System.in);
        
        
        try{
            System.out.print("digite sua opção: ");
            num=input.nextInt();
        } catch (Exception e) {
                System.out.println("Caracter inserido não compatível!");
                continue;
            }
       
        if(num==0){
            System.out.println("fim do programa");
           break;    
        }else{
        
            //switch para os casos de uso
            switch(num){
            
               
            case 1:
                for (int i = 0; i < produto.size(); i++) {
			System.out.println(produto.get(i));

		}
                break;
                
            
                 
            case 2:
                int x;
                try{
                    System.out.printf("qual o id do produto que vc quer ver: ");
                    x= input.nextInt();
                    System.out.println(produto.get(x));
                }catch (Exception e) {
                System.out.println("Caracter inserido não compatível!");
                }
                
                break;
            
                
            case 3:
             try{   
                System.out.println("digite o nome da empresa: ");
                String empresa = inputString.nextLine();
                System.out.println("digite o prazo: ");
                int prazo = input.nextInt();
                System.out.println("digite o valor minimo: ");
                double valorMinimo = input.nextDouble();
                
                Frete objFrete = new Frete(empresa,prazo,valorMinimo);
                
                frete.add(objFrete);
             }catch (Exception e) {
                System.out.println("Digitou algo errado, tente novamente!");
                
            }
                
                break;
            
            case 4:
                for(Frete f: frete){
                    System.out.println(f);
           
                
                }
                 break;
            case 5:
                
                
                break;
            
                 
            case 6:
                int j;
                try{
                  System.out.printf("digite a posição a ser excluida: ");
                  j= input.nextInt();
                  frete.remove(j);
                }catch (Exception e) {
                System.out.println("Caracter inserido não compatível!");
                
                }
            break;
            
          
            case 7:
                String n;
                try{
                   
                  System.out.println("em qual categoria? ");
                  n=inputString.nextLine();
                      if("produtos".equals(n)){
                       System.out.println("digite o id: ");
                       int idProduto= input.nextInt();
                       System.out.println("digite o nome: ");
                       String nome= inputString.nextLine();
                       System.out.println("digite o valor: ");
                       double valor= input.nextDouble();
                       System.out.println("digite o estoque: ");
                       int estoque = input.nextInt();
                     
                       Produtos objProduto= new Produtos(idProduto, nome, valor, estoque);
                     
                       produto.add(objProduto);
                    
               
                         } if("refeicao".equals(n)){
                             System.out.println("digite o id: ");
                             int idProduto= input.nextInt();
                             System.out.println("digite o nome: ");
                             String nome= inputString.nextLine();
                             System.out.println("digite a bebida: ");
                             String bebida= inputString.nextLine();
                             System.out.println("digite o acompanhamento: ");
                             String acompanhamento= inputString.nextLine();
                             System.out.println("digite o valor: ");
                             double valor = input.nextDouble();
                     
                             Refeições objRefeição= new Refeições(idProduto, nome,bebida,acompanhamento, valor );
                     
                             produto.add(objRefeição);
                
                
                                 }if("plano de refeicao".equals(n)){
                                    System.out.println("digite o id: ");
                                    int idProduto= input.nextInt();
                                    System.out.println("digite o nome: ");
                                    String nome= inputString.nextLine();
                                    System.out.println("digite a duração: ");
                                    int duração= input.nextInt();
                                    System.out.println("digite a quantidade: ");
                                    int marmitex= input.nextInt();
                                    System.out.println("digite o valor: ");
                                    double valor = input.nextDouble();
                     
                                    PlanoDeRefeição objPlanoDeRefeição= new PlanoDeRefeição(idProduto, nome, duração, marmitex , valor );
                     
                     
                                    produto.add(objPlanoDeRefeição);
            
                                    }
                                   
                }catch (Exception e) {
                System.out.println("Caracter inserido não compatível!");
                
                }
                
                
                break;
            
            case 8:
                
                
                break;
                
            
            
            case 9:
                int i;
                try{
                  System.out.printf("digite o id do produto a ser excluido: ");
                  i= input.nextInt();
                  produto.remove(i);
                }catch (Exception e) {
                System.out.println("Caracter inserido não compatível!");
                
                }
            break;    
                
                
            default:
                System.out.println("opção invalida");
                
            
          }
        
        }
 
        }
        
        
        
    }

    
   
    @Override
    public void Array() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
