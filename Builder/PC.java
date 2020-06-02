package Builder;

public class PC {
    private int nucleosCPU;
    private float frecuenciaCPU;
    private float almacenamientoSSD;

    private float almacenamientoHDD;
    private int nucleosGPU;

    private PC(ConfiguradorPC conf) {
        this.nucleosCPU = conf.nucleosCPU;
        this.frecuenciaCPU = conf.frecuenciaCPU;
        this.almacenamientoSSD = conf.almacenamientoSSD;
        this.almacenamientoHDD = conf.almacenamientoHDD;
        this.nucleosGPU = conf.nucleosGPU;
    }

    public int getNucleosCPU() {
        return nucleosCPU;
    }

    public float getFrecuenciaCPU() {
        return frecuenciaCPU;
    }

    public float getAlmacenamientoSSD() {
        return almacenamientoSSD;
    }

    public float getAlmacenamientoHDD() {
        return almacenamientoHDD;
    }

    public int getNucleosGPU() {
        return nucleosGPU;
    }

    @Override
    public String toString() {
        String ret = String.format("Especificaciones:\n\nCPU: %d nucleos @ %f GHz\nSSD: %f GB\n", nucleosCPU,
                frecuenciaCPU, almacenamientoSSD);

        if (almacenamientoHDD != -1) {
            ret += String.format("HDD: %f GB\n", almacenamientoHDD);
        }

        if (nucleosGPU != -1) {
            ret += String.format("GPU: %d nucleos", nucleosGPU);
        }

        return ret;
    }

    public static class ConfiguradorPC {
        private int nucleosCPU;
        private float frecuenciaCPU;
        private float almacenamientoSSD;

        private float almacenamientoHDD = -1;
        private int nucleosGPU = -1;

        public ConfiguradorPC(int nucleosCPU, float frecuenciaCPU, float almacenamientoSSD) {
            this.nucleosCPU = nucleosCPU;
            this.frecuenciaCPU = frecuenciaCPU;
            this.almacenamientoSSD = almacenamientoSSD;
        }

        public void setAlmacenamientoHDD(float almacenamientoHDD) {
            this.almacenamientoHDD = almacenamientoHDD;
        }

        public void setNucleosGPU(int nucleosGPU) {
            this.nucleosGPU = nucleosGPU;
        }

        public PC finalizar() {
            return new PC(this);
        }
    }

}