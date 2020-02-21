package gui;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ViewController {

    @FXML
    public JFXButton btnPonto;
    public JFXButton btn0;
    public JFXButton btn00;
    public JFXButton btn1;
    public JFXButton btn2;
    public JFXButton btn3;
    public JFXButton btn4;
    public JFXButton btn5;
    public JFXButton btn6;
    public JFXButton btn7;
    public JFXButton btn8;
    public JFXButton btn9;
    public JFXButton btnSoma;
    public JFXButton btnSub;
    public JFXButton btnDividir;
    public JFXButton btnMultiplicar;
    public JFXButton btnCancelar;
    public JFXButton btnCalcular;
    public JFXTextField tfSaida;
    public Label lbEntrada;

    private long pnumero;
    private long snumero;
    private String operador;

    public void onBtPontoAction(){
        String tela = tfSaida.getText();
        String add = ".";
        tfSaida.setText(tela + add);
    }

    public void onBt0Action(){
        String tela = tfSaida.getText();
        String add = "0";
        tfSaida.setText(tela + add);
    }

    public void onBt00Action(){
        String tela = tfSaida.getText();
        String add = "00";
        tfSaida.setText(tela + add);
    }

    public void onBt1Action(){
        String tela = tfSaida.getText();
        String add = "1";
        tfSaida.setText(tela + add);
    }

    public void onBt2Action(){
        String tela = tfSaida.getText();
        String add = "2";
        tfSaida.setText(tela + add);
    }

    public void onBt3Action(){
        String tela = tfSaida.getText();
        String add = "3";
        tfSaida.setText(tela + add);
    }

    public void onBt4Action(){
        String tela = tfSaida.getText();
        String add = "4";
        tfSaida.setText(tela + add);
    }

    public void onBt5Action(){
        String tela = tfSaida.getText();
        String add = "5";
        tfSaida.setText(tela + add);
    }

    public void onBt6Action(){
        String tela = tfSaida.getText();
        String add = "6";
        tfSaida.setText(tela + add);
    }

    public void onBt7Action(){
        String tela = tfSaida.getText();
        String add = "7";
        tfSaida.setText(tela + add);
    }

    public void onBt8Action(){
        String tela = tfSaida.getText();
        String add = "8";
        tfSaida.setText(tela + add);
    }

    public void onBt9Action(){
        String tela = tfSaida.getText();
        String add = "9";
        tfSaida.setText(tela + add);
    }

    public void onBtSomarAction(){
        String oldTela = tfSaida.getText();
        long valornumero = Integer.parseInt(oldTela);
        this.pnumero = valornumero;
        tfSaida.setText("");
        lbEntrada.setText(oldTela + "+");
        operador = "+";

    }

    public void onBtSubAction(){
        String oldTela = tfSaida.getText();
        long valornumero = Integer.parseInt(oldTela);
        this.pnumero = valornumero;
        tfSaida.setText("");
        lbEntrada.setText(oldTela + "-");
        operador = "-";
    }

    public void onBtDividirAction(){
        String oldTela = tfSaida.getText();
        long valornumero = Integer.parseInt(oldTela);
        this.pnumero = valornumero;
        tfSaida.setText("");
        lbEntrada.setText(oldTela + "/");
        operador = "/";
    }

    public void onBtMultiplicarAction(){
        String oldTela = tfSaida.getText();
        long valornumero = Integer.parseInt(oldTela);
        this.pnumero = valornumero;
        tfSaida.setText("");
        lbEntrada.setText(oldTela + "x");
        operador = "x";
    }

    public void onBtCancelarAction(){
        tfSaida.setText("");
        lbEntrada.setText("");
        this.pnumero = 0;
        this.snumero = 0;
    }

    public void onBtCalcularAction(){
        switch (operador){
            case "+":

                String valor = tfSaida.getText();
                this.snumero = Integer.parseInt(valor);
                long system = this.pnumero + this.snumero;
                tfSaida.setText(String.valueOf(system));
                String entrada = lbEntrada.getText();
                lbEntrada.setText(entrada + valor);
                break;
            case "-":

                String valorSub = tfSaida.getText();
                this.snumero = Integer.parseInt(valorSub);
                long systemSub = this.pnumero - this.snumero;
                tfSaida.setText(String.valueOf(systemSub));
                String entradaSub = lbEntrada.getText();
                lbEntrada.setText(entradaSub + valorSub);
                break;
            case "x":

                String valorMult = tfSaida.getText();
                this.snumero = Integer.parseInt(valorMult);
                long systemMult = this.pnumero * this.snumero;
                tfSaida.setText(String.valueOf(systemMult));
                String entradaMult = lbEntrada.getText();
                lbEntrada.setText(entradaMult + valorMult);
                break;
            case "/":

                String valorDiv = tfSaida.getText();
                this.snumero = Integer.parseInt(valorDiv);
                long systemDiv = this.pnumero / this.snumero;
                tfSaida.setText(String.valueOf(systemDiv));
                String entradaDiv = lbEntrada.getText();
                lbEntrada.setText(entradaDiv + valorDiv);
                break;
        }
    }

}
