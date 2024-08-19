using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Fp.condicionales
{
    public partial class frm40 : Form
    {
        public frm40()
        {
            InitializeComponent();
        }

        private void frm40_Load(object sender, EventArgs e)
        {

        }

        private void textBox17_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox18_TextChanged(object sender, EventArgs e)
        {

        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int matepractica1 = int.Parse(txtMatematicaPractica1.Text);
            int matepractica2 = int.Parse(txtMatematicaPractica2.Text);
            int matepractica3 = int.Parse(txtMatematicaPractica3.Text);
            int mateparcial = int.Parse(txtMatematicaParcial.Text);
            int matefinal = int.Parse(txtMatematicaFinal.Text);

            int fisicapractica1 = int.Parse(txtFisicaPractica1.Text);
            int fisicapractica2 = int.Parse(txtFisicaPractica2.Text);
            int fisicapractica3 = int.Parse(txtFisicaPractica3.Text);
            int fisicaparcial = int.Parse(txtFisicaParcial.Text);
            int fisicafinal = int.Parse(txtFisicaFinal.Text);

            int quimicapractica1 = int.Parse(txtQuimicaPractica1.Text);
            int quimicapractica2 = int.Parse(txtQuimicaPractica2.Text);
            int quimicapractica3 = int.Parse(txtQuimicaPractica3.Text);
            int quimicaparcial = int.Parse(txtQuimicaParcial.Text);
            int quimicafinal = int.Parse(txtQuimicaFinal.Text);

            double matepromedio = 0.1 * matepractica1 + 0.2 * matepractica2 + 0.1 * matepractica3 + 0.3 * mateparcial + 0.3 * matefinal;
            double fisicapromedio = 0.2 * fisicapractica1 + 0.2 * fisicapractica2 + 0.2 * fisicapractica3 + 0.2 * fisicaparcial + 0.2 * fisicafinal;
            double quimicapromedio = 0.1 * quimicapractica1 + 0.3 * quimicapractica2 + 0.1 * quimicapractica3 + 0.25 * quimicaparcial + 0.25 * quimicafinal;

            txtPromedioMatematica.Text = matepromedio.ToString("0.#0");
            txtPromedioFisica.Text = fisicapromedio.ToString("0.#0");
            txtPromedioQuimica.Text = quimicapromedio.ToString("0.#0");

            txtEstadoMatematica.Text = (matepromedio >= 13 ? "Aprobado" : "Desaprobado");
            txtEstadoFisica.Text = (fisicapromedio >= 13 ? "Aprobado" : "Desaprobado");
            txtEstadoQuimica.Text = (quimicapromedio >= 13 ? "Aprobado" : "Desaprobado");
        }
    }
}
