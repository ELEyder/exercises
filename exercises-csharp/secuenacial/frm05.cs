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
    public partial class frm05 : Form
    {
        public frm05()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int Gb = int.Parse(txtG.Text);

            int megabytes = Gb * 1024;

            int kilobytes = Gb * 1024;

            int bytes = Gb * 1024;

            txtM.Text = megabytes.ToString();
            txtK.Text = kilobytes.ToString();
            txtB.Text = bytes.ToString();
        }
    }
}
