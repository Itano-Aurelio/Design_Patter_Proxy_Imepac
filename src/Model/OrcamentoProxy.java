package Model;

import java.math.BigDecimal;

public class OrcamentoProxy extends Model.Orcamento {

    private BigDecimal descontoOrcamento;
    private Model.Orcamento orcamento;

    public OrcamentoProxy(Model.Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getDescontoOrcamento() {
        if (descontoOrcamento == null){
            this.descontoOrcamento = orcamento.getDescontoOrcamento();
        }
        return descontoOrcamento;
    }

    @Override
    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }
}
