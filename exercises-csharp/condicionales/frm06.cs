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
    public partial class frm06 : Form
    {
        public frm06()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int edad1 = int.Parse(txtEdad1.Text);
            int edad2 = int.Parse(txtEdad2.Text);
            int edad3 = int.Parse(txtEdad3.Text);

            int[] lista = new int[4];

            lista[0] = edad1;
            lista[1] = edad2;
            lista[2] = edad3;



            int aux = 0;
            for (int j = 0; j < 2; j++)
            {
                for (int i = 0; i < 2; i++)
                {
                    if (lista[i] > lista[i + 1])
                    {
                        aux = lista[i];
                        lista[i] = lista[i + 1];
                        lista[i + 1] = aux;

                    }
                }
            }

            txtMayor.Text = (lista[2] + "");
            txtMenor.Text = (lista[0] + "");


        }
    }
}
