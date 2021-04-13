package controlador.barramenus.reportes;

import modelo.inanimado.Granja;
import modelo.vivo.animal.Animal;
import vista.barramenus.reportes.ReporteAnimalesVista;

public class ReporteAnimalControlador {
    ReporteAnimalesVista rAnimal = new ReporteAnimalesVista();
    Granja granja;

    public ReporteAnimalControlador(Granja granja) {
        this.granja = granja;
    }

    public void iniciarControlador() {
        rAnimal.setResizable(false);
        rAnimal.setLocationRelativeTo(null);
        rAnimal.setVisible(true);

        imprimirDatos();
    }

    private void imprimirDatos() {
        Animal[] animals = granja.getAnimales();
        for (int i = 0; i < animals.length; i++) {
            String tmp1 = "Animal: " + animals[i].getNombreAnimal() + ", se han comprado: " + String.valueOf(animals[i].getCantidadDeCriasCompradas()
                    + " crias, se han destazado: " + String.valueOf(animals[i].getCantidadDeUnidadesDestazadas()) + " destazadas.");
            String tmp2 = rAnimal.getLblDatosAnimales().getText();
            rAnimal.getLblDatosAnimales().setText("<html><p style=\"width:180px\">"+tmp1+tmp2+"</p></html>");
        }
    }
}
