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
    public partial class frm24 : Form
    {
        public frm24()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            double sueldo;
            int bonus;
            int monto = int.Parse(txtMonto.Text);

            if (monto >= 5500)
            {
                bonus = (monto - 5000) / 500;
                sueldo = monto * 0.1 + bonus * 25;
            }
            else { sueldo = 0.1 * monto; }


            txtSueldo.Text = sueldo.ToString("0.#0");
        }
    }
}
