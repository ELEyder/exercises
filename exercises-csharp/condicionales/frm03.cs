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
    public partial class frm03 : Form
    {
        public frm03()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {
            int angulo = int.Parse( txtAngulo.Text);

            if (angulo == 0) { txtClasificacion.Text = ("nulo"); }
            if (angulo > 0 && angulo < 90) { txtClasificacion.Text = ("agudo"); }
            if (angulo == 90) { txtClasificacion.Text = ("recto"); }
            if (angulo > 90 && angulo < 180) { txtClasificacion.Text = ("obtuso"); }
            if (angulo == 180) { txtClasificacion.Text = ("llano"); }
            if (angulo > 180 && angulo < 360) { txtClasificacion.Text = ("concavo"); }
            if (angulo == 360) { txtClasificacion.Text = ("completo"); }
            if (angulo > 360) { txtClasificacion.Text = "Mayor a una vuelta"; }
        }
    }
}
