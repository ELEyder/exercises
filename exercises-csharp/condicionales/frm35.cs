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
    public partial class frm35 : Form
    {
        public frm35()
        {
            InitializeComponent();
        }

        private void Calcular_Click(object sender, EventArgs e)
        {

            int codigo = int.Parse(txtCodigo.Text);

            if (codigo % 2 == 0 && codigo % 3 == 0 && codigo % 5 == 0) txtTrabajo.Text=("Administrador");
            if (codigo % 2 != 0 && codigo % 3 == 0 && codigo % 5 == 0) txtTrabajo.Text=("Directivo");
            if (codigo % 2 == 0 && codigo % 3 != 0 && codigo % 5 != 0) txtTrabajo.Text=("Vendedor");
            if (codigo % 2 != 0 && codigo % 3 != 0 && codigo % 5 != 0) txtTrabajo.Text=("Seguridad");
        }
    }
}
