package fastmenu.gcherubini.android.prototipo.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import fastmenu.gcherubini.android.prototipo.R;
import fastmenu.gcherubini.android.prototipo.registrar.RegistrarActivity;
import fastmenu.gcherubini.android.prototipo.superclasses.SingleFragmentActivity;

/**
 * Created by Gabriel on 23/08/2016.
 */
public class LoginFragment extends Fragment
{
    private Button mRegistrarButtonLogin;
    private Button mLoginButtonLogin;
    private EditText mEmailEditText;
    private EditText mSenhaEditText;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        mEmailEditText = (EditText)v.findViewById(R.id.emailLogin_editText);
        mSenhaEditText = (EditText)v.findViewById(R.id.senhaLogin_editText);

        mRegistrarButtonLogin = (Button)v.findViewById(R.id.registrarLogin_button);
        mRegistrarButtonLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),RegistrarActivity.class);
                startActivity(intent);
            }
        });


        mLoginButtonLogin = (Button)v.findViewById(R.id.loginLogin_button);
        mLoginButtonLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);

                /*UsuarioLogin usuarioLogin = new UsuarioLogin(mEmailEditText.getText().toString(), mSenhaEditText.getText().toString());

                if(usuarioLogin.isUserRegistered())
                {
                    Usuario usuario = usuarioLogin.buscaUsuario();

                    if (usuario.getSenha1().equals(mSenhaEditText.getText().toString()))
                    {
                        //TODO: Código para logar usuário (criar fragmento de menu, com subfragmento de informações do usuario)
                        //TODO: Código para exibir tela de seleção de restaurantes
                    }
                }*/
            }
        });

        return v;
    }
}
