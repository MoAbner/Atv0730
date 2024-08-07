public class Volei {
    private int pontuacaoTimeA;
    private int pontuacaoTimeB;

    public Volei() {
        this.pontuacaoTimeA = 0;
        this.pontuacaoTimeB = 0;
    }

    public void pontoTimeA() {
        pontuacaoTimeA++;
    }

    public void pontoTimeB() {
        pontuacaoTimeB++;
    }

    public int getPontuacaoTimeA() {
        return pontuacaoTimeA;
    }

    public int getPontuacaoTimeB() {
        return pontuacaoTimeB;
    }

    public String getVencedor() {
        if (pontuacaoTimeA >= 25 && (pontuacaoTimeA - pontuacaoTimeB) >= 2) {
            return "Time A";
        } else if (pontuacaoTimeB >= 25 && (pontuacaoTimeB - pontuacaoTimeA) >= 2) {
            return "Time B";
        } else {
            return "Jogo em andamento";
        }
    }

    public String verificarBola(double x, double y) {
        // Supondo que o campo tem dimensões 18x9 (comprimento x largura)
        if (x >= 0 && x <= 18 && y >= 0 && y <= 9) {
            return "Dentro";
        } else {
            return "Fora";
        }
    }
}
