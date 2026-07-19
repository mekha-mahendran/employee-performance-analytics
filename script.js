let sortDirection = {};

function sortTable(colIndex) {
  const table = document.getElementById("empTable");
  const rows = Array.from(table.rows).slice(1);
  const dir = sortDirection[colIndex] = !sortDirection[colIndex];

  rows.sort((a, b) => {
    let x = a.cells[colIndex].innerText;
    let y = b.cells[colIndex].innerText;
    if (!isNaN(x) && !isNaN(y)) { x = +x; y = +y; }
    return dir ? (x > y ? 1 : -1) : (x < y ? 1 : -1);
  });

  rows.forEach(row => table.tBodies[0].appendChild(row));
}