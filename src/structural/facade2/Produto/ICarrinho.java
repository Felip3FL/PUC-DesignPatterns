package structural.facade2.Produto;

import java.util.List;

public interface ICarrinho {
	public void setProduto(IProduto produto);
	@SuppressWarnings("rawtypes")
	public List getlistaDeProdutos();
}
