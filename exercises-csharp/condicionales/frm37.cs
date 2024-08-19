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
    public partial class frm37 : Form
    {
        public frm37()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int pamela = int.Parse(txtPamela.Text);
            int carol = int.Parse(txtCarol.Text);
            int fanny = int.Parse(txtFanny.Text);

            int votos = ((pamela + carol + fanny) / 2) + 1;

            if (pamela >= votos)
            {
                txtGanadora.Text = ("Pamela");
            }
            else if (carol >= votos)
            {
                txtGanadora.Text = ("Carol");
            }
            else if (fanny >= votos)
            {
                txtGanadora.Text=("Fanny");
            }
            else if (pamela >= carol && pamela >= fanny)
            {
                if (carol > fanny) { txtGanadora.Text = ("Pasan a la sgte ronda: Pamela y Carol"); }
                else if (carol < fanny) { txtGanadora.Text = ("Pasan a la sgte ronda: Pamela y Fanny"); }
                else if (carol == fanny) { txtGanadora.Text = ("Se anula la eleccion"); }
            }
            else if (carol >= pamela && carol >= fanny)
            {
                if (pamela > fanny) { txtGanadora.Text=("Pasan a la sgte ronda: Carol y Pamela"); }
                else if (pamela < fanny) { txtGanadora.Text=("Pasan a la sgte ronda: Carol y fanny"); }
                else if (fanny == pamela) { txtGanadora.Text=("Se anula la eleccion"); }
            }
            else if (fanny >= carol && fanny >= pamela)
            {
                if (carol > pamela) { txtGanadora.Text=("Pasan a la sgte ronda: Fanny y Carol"); }
                else if (carol < pamela) { txtGanadora.Text=("Pasan a la sgte ronda: Fanny y Pamela"); }
                else if (carol == pamela) { txtGanadora.Text=("Se anula la eleccion"); }
            }
            else if (pamela == carol && carol == fanny)
            { txtGanadora.Text=("Se anula la eleccion"); }
        }
    }
    }

