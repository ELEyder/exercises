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
    public partial class frm28 : Form
    {
        public frm28()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {

            int horas = int.Parse(txtHoras.Text);
            int minutos = int.Parse(txtMinutos.Text);

            if (12 < horas && horas <= 24 && 0 <= minutos && minutos < 60)
                horas -= 12;
                txtNuevo.Text = (horas + ":" + minutos + "pm");
            if (0 < horas && horas <= 12 && 0 <= minutos && minutos < 60)
                txtNuevo.Text = (horas + ":" + minutos);
            else txtNuevo.Text = ("error");
        }
    }
}
