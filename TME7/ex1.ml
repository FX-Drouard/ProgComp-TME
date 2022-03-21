let hash = Hashtbl.create 2048

let intern a =
	try Hashtbl.find hash a
	with Not_found -> Hashtbl.add hash a a
	
(* Création liste chaînes *)
let init_hash fich =
	let fi = open_in fich in
	try
		while true do
			let s = input_line fi in
			print_endline s
		done
	with End_of_file -> close_in fi;;
	
init_hash "./small.txt";;
