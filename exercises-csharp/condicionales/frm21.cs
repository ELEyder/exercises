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
    public partial class frm21 : Form
    {
        public frm21()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int edad = int.Parse(txtEdad.Text);


            int estado = 0;
            
            if (txtEstado.Equals("soltero")) estado = 1;
            if (txtEstado.Equals("casado")) estado = 2;
            if (txtEstado.Equals("divorciado")) estado = 3;
            if (txtEstado.Equals("viudo")) estado = 4;
            


            int genero = 0;
            if (txtGenero.Equals("masculino")) genero = 1;
            if (txtGenero.Equals("femenino")) genero = 2;



            txtCodigo.Text = (genero + "" + edad + "" + estado);

        }
    }
}
