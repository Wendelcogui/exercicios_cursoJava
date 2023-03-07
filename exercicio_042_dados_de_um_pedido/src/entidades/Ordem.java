package entidades;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusDoPedido;

public class Ordem {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusDoPedido status;
	
	private Cliente cliente;
	
	private List<ItemDoPedido> items = new ArrayList<>();
	
	public  Ordem() {
	}
	
	public Ordem(Date momento, StatusDoPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItems(ItemDoPedido item) {
		items.add(item);
	}
	public void removeItems(ItemDoPedido item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(ItemDoPedido c : items ) {
			soma += c.subTotal();
		}	
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento da ordem:");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens de encomenda:\n");
		for (ItemDoPedido item : items) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}	
}
