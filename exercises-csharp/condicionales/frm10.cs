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
    public partial class frm10 : Form
    {
        public frm10()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            double nota1 = Double.Parse(txtNota1.Text);
            double nota2 = Double.Parse(txtNota2.Text);
            double nota3 = Double.Parse(txtNota3.Text);
            double nota4 = Double.Parse(txtNota4.Text);
            double nota5 = Double.Parse(txtNota5.Text);

            /*
            int[] numeros = { n1, n2, n3, n4, n5 };

            Array.Sort(numeros);
            */

            double[] notas = { nota1,nota2,nota3,nota4,nota5 };
            Array.Sort(notas);


            double promedio = (( notas[1] + notas[2] + notas[3]) / 3);

            txtNotaEliminadas.Text = (" " + notas[0] + " ; " + notas[4]);

            txtPromedio.Text = promedio.ToString("#.0#");

            txtEstado.Text = (promedio >= 11 ? "Aprobado" : "Desaprobado");
        }
    }
}
