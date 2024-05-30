package collectionsJavaApi.atividades.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Item> listaItens;
	
	public CarrinhoCompras() {
		this.listaItens = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaItens.add( new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		if(!listaItens.isEmpty()) {
			List<Item> itemRemover = new ArrayList<>();
			
			for(Item item: listaItens) {
				if(item.getNome().equalsIgnoreCase(nome)) {
					itemRemover.add(item);
				};
			}
			
			listaItens.removeAll(itemRemover);
		}else {
			System.out.println("A lista não tem itens!");
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
	    if (!listaItens.isEmpty()) {
	      for (Item item : listaItens) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal += valorItem;
	      }
	      return valorTotal;
	    } else {
	      throw new RuntimeException ("Lista Vazia!");
	    }
	}
	
	public void exibirItens() {
		if(!listaItens.isEmpty()) {
			System.out.println(listaItens);
		} else {
			System.out.println("Lista Vazia!");
		}
	}
	
	public static void main(String[] args) {
		CarrinhoCompras listaItens = new CarrinhoCompras();
		
		listaItens.exibirItens();
		
		listaItens.removerItem("Lapis");
		
		for(int i = 0; i < 5; i++){
			listaItens.adicionarItem("Item 0"+i, i+1, i+1);
		}
		listaItens.adicionarItem("Lapis", 1, 1);
		
		listaItens.exibirItens();
		
		listaItens.removerItem("Lapis");
		
		listaItens.exibirItens(); 
		
		System.out.println("O valor total da compra é = " + listaItens.calcularValorTotal());
	}
	
}
