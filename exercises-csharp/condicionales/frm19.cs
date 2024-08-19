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
    public partial class frm19 : Form
    {
        public frm19()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            String genero = (txtGenero.Text);
            int edad = int.Parse(txtEdad.Text);


            txtCategoria.Text = (genero == "femenino" ? "FB" : edad < 23 ? "FA" : genero == "masculino" ? "MB" : "MA");

        }
    }
}
