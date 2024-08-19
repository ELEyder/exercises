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
    public partial class frm05 : Form
    {
        public frm05()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int numero = int.Parse(txtNumero1.Text);

            int a = numero / 1000;
            int b = numero / 100 - a * 10;
            int c = numero / 10 - a * 100 - b * 10;
            int d = numero - a * 1000 - b * 100 - c * 10;

            int[] lista = new int[4];

            lista[0] = a;
            lista[1] = b;
            lista[2] = c;
            lista[3] = d;



            int aux = 0;
            for (int j = 0; j < 3; j++)
            {
                for (int i = 0; i < 3; i++)
                {
                    if (lista[i] > lista[i + 1])
                    {
                        aux = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = aux;

                    }
                }
            }


            txtNumero2.Text = (lista[3] + "" + lista[0]);

        }
    }
}
