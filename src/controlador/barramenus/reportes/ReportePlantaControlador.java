package controlador.barramenus.reportes;

import modelo.inanimado.Granja;
import modelo.vivo.animal.Animal;
import modelo.vivo.vegetal.Planta;
import vista.barramenus.reportes.ReportePlantasVista;

public class ReportePlantaControlador {
    ReportePlantasVista rPlanta = new ReportePlantasVista();
    Granja granja;

    public ReportePlantaControlador(Granja granja) {
        this.granja = granja;
    }

    public void imprimirDatos() {
        rPlanta.setResizable(false);
        rPlanta.setLocationRelativeTo(null);
        rPlanta.setVisible(true);

        imprimirDatodd();
    }

    private void imprimirDatodd() {
        Planta[] plantas = granja.getPlantas();
        for (int i = 0; i < plantas.length; i++) {
            String tmp1 = "Planta: " + plantas[i].getNombre() + ", se han comprado: " + String.valueOf(plantas[i].getCantidadDeSemillasCompradas()
                    + " semillas" + ", la cantidad de celdas sembradas son: " + String.valueOf(plantas[i].getCantidadCeldasCompradas())) + ".";
            String tmp2 = rPlanta.getLblDatosPlantas().getText();
            rPlanta.getLblDatosPlantas().setText("<html><p style=\"width:180px\">"+tmp1+tmp2+"</p></html>");
        }


    }

}
