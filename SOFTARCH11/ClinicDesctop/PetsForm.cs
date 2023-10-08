using ClinicServiceNamespace;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ClinicDesctop
{
    public partial class PetsForm : Form
    {
        public PetsForm()
        {
            InitializeComponent();
        }

        private void btnUpdatePets_click(object sender, EventArgs e)
        {
            ClinicClient clinicClient = new ClinicClient("http://localhost:5076/", new HttpClient());
            ICollection<Pet> pets = clinicClient.PetGetAllAsync().Result;

            listViewPets.Items.Clear();
            foreach (Pet pet in pets)
            {
                ListViewItem item = new ListViewItem();
                item.Text = pet.PetId.ToString();
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.ClientId.ToString()
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.Name.ToString()
                });
                item.SubItems.Add(new ListViewItem.ListViewSubItem()
                {
                    Text = pet.Birthday.ToString()
                });
                listViewPets.Items.Add(item);
            }
        }
    }
}