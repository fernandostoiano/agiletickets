package br.com.caelum.agiletickets.models;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.agiletickets.domain.Promocao;

public class SessaoTest {


	@Test
	public void deveVender1ingressoSeHa2vagas() throws Exception {
		Sessao sessao = new Sessao();
        sessao.setTotalIngressos(2);

        Assert.assertTrue(sessao.podeReservar(1));
	}

	@Test
	public void naoDeveVender3ingressoSeHa2vagas() throws Exception {
		Sessao sessao = new Sessao();
		sessao.setTotalIngressos(2);

		Assert.assertFalse(sessao.podeReservar(3));
	}

	@Test
	public void reservarIngressosDeveDiminuirONumeroDeIngressosDisponiveis() throws Exception {
		Sessao sessao = new Sessao();
		sessao.setTotalIngressos(5);

		sessao.reserva(3);
		Assert.assertEquals(2, sessao.getIngressosDisponiveis().intValue());
	}
	
	@Test
	public void deveReservarSeHaIngressoDisponiveis() {
		
		Sessao sessao = new Sessao();
		sessao.setTotalIngressos(2);
		
		boolean podeReservar = sessao.podeReservar(2);
		
		Assert.assertTrue(podeReservar);
	}
	
	@Test
	public void verificaPromocaoValida() {
		Sessao sessao = new Sessao();
		sessao.setInicio(new DateTime());

		Promocao promocao = new Promocao();
		promocao.setInicio(new DateTime().minusHours(1));
		promocao.setFim(new DateTime().plusHours(1));

		Assert.assertTrue(sessao.dentroDoIntervalo(promocao));
	}

	@Test
	public void verificaPromocaoPassadaInvalida() {
		Sessao sessao = new Sessao();
		sessao.setInicio(new DateTime());

		Promocao promocao = new Promocao();
		promocao.setInicio(new DateTime().minusHours(1));
		promocao.setFim(new DateTime().minusMinutes(1));

		Assert.assertFalse(sessao.dentroDoIntervalo(promocao));
	}

	@Test
	public void verificaPromocaoFuturaInvalida() {
		Sessao sessao = new Sessao();
		sessao.setInicio(new DateTime());

		Promocao promocao = new Promocao();
		promocao.setInicio(new DateTime().plusMinutes(1));
		promocao.setFim(new DateTime().plusHours(1));

		Assert.assertFalse(sessao.dentroDoIntervalo(promocao));
	}
}
