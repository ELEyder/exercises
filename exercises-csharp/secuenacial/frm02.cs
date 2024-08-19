using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ejercicios.secuencial
{
    public partial class frm02 : Form
    {
        public frm02()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int cant = int.Parse(txtMt.Text);

            double cm = cant * 100;
            double pul = cm / 2.54;
            double pies = pul / 12;
            double yard = pies / 3;

            txtCm.Text = cm.ToString();
            txtPul.Text = pul.ToString();
            txtPies.Text = pies.ToString();
            txtYar.Text = yard.ToString();


        }
    }
}
