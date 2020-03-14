package comum;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ServicoRemotoImpl extends UnicastRemoteObject implements IServicoRemoto {
	
	private static List<Pessoa> LstPessoa = new ArrayList<>();
	
	public ServicoRemotoImpl() throws RemoteException {
	}
	
	private static final long serialversionUID = 7334161650385718588L;
	
	@Override
	public void inserir(Pessoa p) throws RemoteException {
		LstPessoa.add(p);
	}
	@Override
	public List<Pessoa> listarPessoa() throws RemoteException {
		return LstPessoa;
	}
}
